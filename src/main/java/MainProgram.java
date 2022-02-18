
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MainProgram {
    public static void main(String[] args) {
        BeanFactory bfactory=new XmlBeanFactory(new FileSystemResource("springcorexm.xml"));
        ProcessUserData pud=(ProcessUserData)bfactory.getBean("mainPgm");
        pud.printData();
    }
}
