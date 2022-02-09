package 基础.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest {

    public static void main(String[] args) {
        test05();
    }

    private static final String const_filePath = "test.txt";
    private static final String const_filePathChinese = "中文.txt";
    private File const_file = null;
    private File const_fileChinese = null;

    public IOTest() {
        this.const_file = new File(const_filePath);
        this.const_fileChinese = new File(const_filePathChinese);
    }
    /**
     * @param msg 带输出信息
     * @param b_wrap 是否换行
     */
    private static void log(Object msg, boolean b_wrap) {
        if(true == b_wrap) {
            System.out.println(msg + "");
        }else {
            System.out.print(msg + "");
        }
    }

    /**
     * @param msg
     */
    private static void log(Object msg) {
        log(msg, true, true);
    }

    /**
     * @param msg 带输出信息
     * @param b_wrap 是否换行
     * @param out 是否输出
     */
    private static void log(Object msg, boolean b_wrap, boolean out) {
        if(true == out) {
            if(true == b_wrap) {
                System.out.println(msg + "");
            }else {
                System.out.print(msg + "");
            }
        }
    }


    /**
     * 字节流读取文件：单个字符读取
     * @param b_chinese_file
     */
    private static void test01(boolean b_chinese_file) {
        IOTest ioTest = new IOTest();
        FileInputStream fis = null;
        try {
            if(true == b_chinese_file) {
                //测试字节流读取中文乱码问题
                fis = new FileInputStream(ioTest.const_fileChinese);
            }else {
                fis = new FileInputStream(ioTest.const_file);
            }
            int read = 0;
            while ((read = fis.read())!=-1) {
                log((char)read, false);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 字节流读取文件：数组循环读取
     */
    private static byte[] test02() {
        IOTest ioTest = new IOTest();
        FileInputStream fis = null;
        int len = 512;
        byte[] buffer = new byte[len];
        try {
            fis = new FileInputStream(ioTest.const_file);
            int read;
            while ((read = fis.read(buffer,0,len)) != -1) {
                log(buffer + "", true, false);
            }
            for(byte b : buffer) {
                if(true == Character.isLetterOrDigit((char)b) || (char)b == '\n') {
                    log((char)b, false, false);
                }
            }
        } catch (FileNotFoundException e) {
            return new byte[1];
        } catch (IOException e) {
            return new byte[1];
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return buffer;
    }
    /**
     * 字符流读取中文文档，解决字节流读取中文乱码问题
     */
    private static void test03() {
        IOTest ioTest = new IOTest();
        FileReader fr = null;
        try {
            fr = new FileReader(ioTest.const_fileChinese);
            int read = 0;
            while ((read = fr.read()) != -1) {
                log((char)read, false);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 字节流写操作
     * @throws IOException
     * @throws FileNotFoundException
     */
    private static void test04() {
        String outPath = const_filePathChinese;
        FileOutputStream fos = null;
        try {
            File file = new File(outPath);
            byte[] buffer = test02();
            fos = new FileOutputStream(file);
            fos.write(buffer);
        } catch (FileNotFoundException e) {
            log("FileNotFoundException: " + e);
        } catch (IOException e) {
            log("IOException: " + e);
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 字符流写操作
     * @throws IOException
     * @throws FileNotFoundException
     */
    private static void test05() {
        String outPath = const_filePath;
        IOTest ioTest = new IOTest();
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(ioTest.const_fileChinese);
            StringBuilder sb = new StringBuilder();

            int read = 0;
            while ((read = fr.read()) != -1) {
                log((char)read, false);
                sb.append((char)read);
            }

            File file = new File(outPath);
            fw = new FileWriter(file);
            fw.write(sb.toString());
        } catch (FileNotFoundException e) {
            log("FileNotFoundException: " + e);
        } catch (IOException e) {
            log("IOException: " + e);
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}


