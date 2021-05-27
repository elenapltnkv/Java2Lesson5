import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Csv<line> {


    public Csv() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException, FileNotFoundException {
        File dir = new File("C:\\Users\\Руслан\\Desktop\\пряники");
        PrintWriter pw = new PrintWriter(new File("file.csv"));
        String[] header = new String[]{"Value 1;", "Value 2;", "Value 3;"};

        int[] AppData = new int[]{100, 200, 300};

        pw.write(Arrays.toString(header));
        pw.write(Arrays.toString(AppData));
        pw.close();
        System.out.println("done!");
    }

    private static void Data() {
    }

    public InputStreamReader in;

    {
        in = new InputStreamReader(new FileInputStream("file.csv"), StandardCharsets.UTF_8);
        int charCode = 0;
        while (true) {
            try {
                if (charCode == in.read()) {
                    continue;
                }
                break;
            } catch (IOException e) {
                e.printStackTrace();
            
               System.out.println((char) charCode);

            }
            ArrayList<AppData>appDataArrayList = new ArrayList<>();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("file.csv")){
                    String line;
                    try {
                            if (charCode == in.read()) continue;

                        } catch (IOException e) {
                            e.printStackTrace();

                            System.out.println(line);

                        }
                    }

                    }catch (IOException e){
                        e.printStackTrace();
                    }
                };
            };
        }
    }
}


