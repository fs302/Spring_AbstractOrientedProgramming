import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Author: fs302
 * Date: 14-6-24
 * Time: 上午11:50
 */
public class XMLtest {
    public static void main(String[] args) throws Exception
    {
        SAXBuilder builder = new SAXBuilder();
        try {
            Document doc = builder.build(new File("src/disk.xml"));
            Element rootEl = doc.getRootElement();
            //获得所有子元素
            List<Element> list = rootEl.getChildren("disk");
            for (Element el : list) {
                String name = el.getAttributeValue("name");
                String capacity = el.getChildText("capacity");
                String directories = el.getChildText("directories");
                String files = el.getChildText("files");

                System.out.println("[磁盘信息]");
                System.out.println("分区盘符："+name);
                System.out.println("分区容量："+capacity);
                System.out.println("目录数："+directories);
                System.out.println("文件数："+files);
                System.out.println("-----------------------------");
            }
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
