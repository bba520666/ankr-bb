import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebPageScraper {
    public static void main(String[] args) {
        try {
            // 指定要获取信息的网页URL
            String url = "https://www.example.com";

            // 创建URL对象
            URL webpage = new URL(url);

            // 打开URL连接
            URLConnection connection = webpage.openConnection();

            // 创建输入流读取器
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // 读取网页内容
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }

            // 关闭读取器
            reader.close();

            // 输出网页内容
            System.out.println(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
