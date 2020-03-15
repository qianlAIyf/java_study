import java.io.*;
public class IOTest {
    public static void main(String [] args) throws IOException{
//        char c;
//        String string;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("please input character,press 'q' to exit.");
//        do{
//            c = (char) br.read();
//            System.out.println(c);
//        }while(c != 'q');
//        System.out.println("please input lines of text, and end with 'end'.");
//        do{
//            string = br.readLine();
//            System.out.println(string);
//        }while(!string.equals("end"));

//        FileTest1.t1();
//        FileTest2.t2();
//        CreateDir.t3();
//        DirList.t4();
        DeleteFolder.t5(new File("新建文件夹"));
    }
}

class FileTest1{
    public static void t1(){
        try {
            byte [] b = {10, 41, 3, 127};
            OutputStream outputStream = new FileOutputStream("fileText.txt");
            for(int x = 0; x < b.length; x ++){
                outputStream.write(b[x]);
            }
            outputStream.close();

            InputStream inputStream = new FileInputStream("fileText.txt");
            int size = inputStream.available();
            for(int x = 0; x < size; x ++){
                System.out.print((char)inputStream.read() + " ");
            }
        }catch (IOException e){
            System.out.println("Exception");
        }
    }
}

class FileTest2{
    public static void t2() throws IOException{
        File file = new File("fileText2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream,"utf-8");

        writer.append("Chinese Input");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");

        StringBuffer stringBuffer = new StringBuffer();
        while(inputStreamReader.ready()){
            stringBuffer.append((char)inputStreamReader.read());
        }
        System.out.println(stringBuffer.toString());
        inputStreamReader.close();
        fileInputStream.close();
    }
}

class CreateDir{
    public static void t3(){
        String dirName = "new";//相对路径，源文件夹src的上层
        File file = new File(dirName);
        file.mkdir();
    }
}

class DirList{
    public static void t4(){
        String dirName = "out";
        File file = new File(dirName);

        if(file.isDirectory()){
            System.out.println("directory:" + dirName);
            String [] s = file.list();
            for(int i = 0; i < s.length; i ++){
                File file1 = new File(dirName + "/" + s[i]);
                if(file1.isDirectory())
                    System.out.println(s[i] + " is a directory.");
                else
                    System.out.println(s[i] + " is a file.");
            }
        } else {
            System.out.println(dirName + " is not a directory.");
        }
    }
}

class DeleteFolder{
    public static void t5(File folder){
        File [] files = folder.listFiles();
        if(files != null){
            for(File f: files){
                if(f.isDirectory())
                    t5(f);
                else
                    f.delete();
            }
        }
        folder.delete();
    }

}