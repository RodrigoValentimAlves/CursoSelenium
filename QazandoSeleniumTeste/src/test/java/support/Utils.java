package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.time.Duration;
import java.util.Random;


public class Utils extends RunCucumberTest {
    /*
        public void waitElementBePresent(By element, Int tempo) {
            WebDriverWait wait = new WebDriverWait(driver, tempo);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        Está dando erro
     */
    public void esperarElementoEstarPresente(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getRandomEmail() {

        String email_init = "rodrigo_";
        String email_final = "@teste.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999;
        int resultado = random.nextInt(maximo - minimo) + minimo;

        return email_init + resultado + email_final;
    }
}


