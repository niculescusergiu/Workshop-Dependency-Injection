package org.example;

import org.example.config.ComponentScanConfig;
import org.example.config.ScannerConfig;
import org.example.data_access.StudentDao;
import org.example.util.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        //StudentDao studentDao = context.getBean(StudentDao.class);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScannerConfig.class);
        UserInputService userInputService = context.getBean(UserInputService.class);
    }
}
