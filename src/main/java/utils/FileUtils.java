package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileUtils {
    /*
    此方法用于整理照片视频等素材
    遍历某个文件夹中的所有文件（不包含子级文件夹）
    按照每个文件的创建时间
    创建"年月日"文件夹
    将该文件移入该子文件夹中，并改名为"创建日期+当前时间戳.文件类型"
     */
    public void batchChangeFileNamesAndMoveToDateDir(String path,String type){
        File file = new File(path);
        System.out.println("读取文件夹中...");
        File[] files = file.listFiles();
        for (File item : files){
            if (item.isDirectory()){
                continue;
            }
            if (".DS_Store".equals(item.getName())){
                continue;
            }
            System.out.println("开始遍历图片...");
            BasicFileAttributes attr = null;
            try {
                Path filePath =  item.toPath();
                attr = Files.readAttributes(filePath, BasicFileAttributes.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 创建时间
            Instant instant = attr.creationTime().toInstant();
            String dateStr = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.systemDefault()).format(instant);
            System.out.println("" + item.getName()+"的创建时间是："+dateStr);
            //获取当前时间戳
            String fileName = item.getName();
            String typeStr = fileName.substring(fileName.indexOf("."),fileName.length());
            long millis = System.currentTimeMillis();
            System.out.println(millis);
            String newPath;
            switch (type){
                case "year":
                    newPath = path+"/"+dateStr.substring(0,4);
                    break;
                case "month":
                    newPath = path+"/"+dateStr.substring(0,6);
                    break;
                case "day":
                    newPath = path+"/"+dateStr.substring(0,8);
                    break;
                default:
                    newPath = path+"/"+dateStr.substring(0,6);
                    break;
            }
            File fnewPath = new File(newPath);
            if (!fnewPath.exists()){
                fnewPath.mkdir();
            }
            item.renameTo(new File(newPath+"/"+dateStr+millis+typeStr));
        }
    }

    /*
    此方法用于计算某文件夹下所有文件数量（包括子文件夹）
    递归
    注意：
    DS_Store(英文全称 Desktop Services Store)是一种由苹果公司的Mac OS X操作系统所创造的隐藏文件，目的在于存贮目录的自定义属性，例如文件的图标位置或者是背景色的选择。相当于 Windows 下的 desktop.ini。
    如果你的项目中还没有自动生成的 .DS_Store 文件，那么直接将 .DS_Store 加入到 .gitignore 文件就可以了。如果你的项目中已经存在 .DS_Store 文件，那就需要先从项目中将其删除，再将它加入到 .gitignore。如下：
    删除项目中的所有.DS_Store。这会跳过不在项目中的 .DS_Store
     */
    public int checkAllFilesCount(String path){
        File file = new File(path);
        File[] files = file.listFiles();
        int count = 0;
        for (File item : files){
            if (".DS_Store".equals(item.getName())) continue;
            if (!item.isDirectory()){
                System.out.println("第"+(count+1)+"个文件名是"+item.getName());
                count++;
            }else {
                count = count + checkAllFilesCount(item.getPath());
            }
        }
        return count;
    }

    /*
    将某个文件夹中所有文件（包括子文件夹中的文件）移动到另一个文件夹中（可以是相同文件夹）
     */
    public void moveAllFilesToSuperParentDir(String path, String targetPath){
        File file = new File(path);
        File[] files = file.listFiles();
        for(File item : files){
            if (item.isDirectory()) {
                System.out.println(item.getPath());
                moveAllFilesToSuperParentDir(item.getPath(),targetPath);
            }else{
                item.renameTo(new File(targetPath +"/"+item.getName()));
            }

        }
    }

    /*
    删除所有空文件夹，包括子级文件夹
     */
    public void delEmptyDir(String path){
        File file = new File(path);
        File[] files = file.listFiles();
        for(File item :files){
            if (item.isDirectory()){
                if (checkEmpty(item.getPath())){
                    item.delete();
                }else {
                    delEmptyDir(item.getPath());
                }
            }
        }
    }

    /*
    判断文件夹是否为空
     */
    public boolean checkEmpty(String path){
        File file = new File(path);
        return file.listFiles().length == 0;
    }

    /*
    删除某个文件
     */
    public boolean delSingleFile(String path,String name){
        String filePath = path + ("".equals(name)?"":"/"+name);
        File file = new File(filePath);
        return  file.delete();
    }

    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        String testPath = "/Users/alexleon/Desktop/aaaaaa";
        //01.读取文件创建时间，按创建时间（可选按年，按月，或按日）分配文件夹，并将文件分配进各自的文件夹中，且文件名被重新命名（规则：文件创建时间+当前时间戳）
//        fileUtils.batchChangeFileNamesAndMoveToDateDir(testPath,"month");//可用参数是 year, month, day
        //02.查询所有文件的数量，包含子文件夹
//        System.out.println(fileUtils.checkAllFilesCount(testPath));
        //03.将当前目录 所有文件 移动到 指定目录， 包括子文件夹
//        fileUtils.moveAllFilesToSuperParentDir(testPath,testPath);
        //04.删除所有空文件夹，包括子文件夹
//        fileUtils.delEmptyDir(testPath);
        //05.删除某个文件
//        System.out.println(fileUtils.delSingleFile(testPath+"/202201","202201060025461641461652602.DS_Store"));
    }
}