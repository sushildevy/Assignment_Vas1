package Question44;

import java.io.*;
import java.util.*;

public class Main {
    public static void ReadFromFile(String name){
        String readFilePath="C:\\Users\\Sushil's PC\\Desktop\\Java_training\\vastika\\Student.txt";
       Map<String,String> map=new HashMap<String,String>();
       String key="";
       String value;
        try {
            FileReader fr=new FileReader(readFilePath);
            BufferedReader br=new BufferedReader(fr);
            String len;
            while((len = br.readLine())!=null){
                String [] parts =len.split(",",2);
                if(parts.length>=2){
                     key = parts[0];
                     value = parts[1];
                     map.put(key, value);
                }
            }
            String address="";
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            Map.Entry<String, String> entry = null;
            while(iterator.hasNext()){
                 entry=iterator.next();
                if(name.toLowerCase().equals(entry.getKey().toLowerCase())){
                    //System.out.println("The address of " +name +" is "+ entry.getValue());
                    address=entry.getValue();
                }

            }
            assert address != null;
            if(map.containsKey(name)){
                System.out.println("The address of " +name +" is "+ address);
            }
            else{
                System.out.println("name not found");
            }

            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void WriteInFile(Map<String,String> map) {
        String writeFilePath = "C:\\Users\\Sushil's PC\\Desktop\\Java_training\\vastika\\Student.txt";
        try {
            FileWriter fw = new FileWriter(writeFilePath);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Map.Entry<String, String> m : map.entrySet()) {
                bw.write(m.getKey()+"," + m.getValue()+ "\n");
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,String> studentMap=new HashMap<String,String>();
        int num=0;
        while(num!=3){
            System.out.println("Student "+(num+1) + " :");
            System.out.println("please enter the student name: ");
            String sName=sc.nextLine();
            System.out.println("please, enter the address: ");
            String sAddress=sc.nextLine();
            Student s=new Student(sName,sAddress);
            studentMap.put(sName,sAddress);
            num++;
        }
        System.out.println(studentMap);
        WriteInFile(studentMap);
            System.out.println("Please enter the name of student to find address: ");
            String name=sc.next();
            ReadFromFile(name);



    }
}
