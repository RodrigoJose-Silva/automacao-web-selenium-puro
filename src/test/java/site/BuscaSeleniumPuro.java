//1- PACOTE
package site;
//2- BIBLIOTECAS


import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3- CLASSE
public class BuscaSeleniumPuro {
    //3.1- ATRIBUTOS
    String url = "https://iterasys.com.br/";
    WebDriver driver;

    //3.2- MÉTODOS E FUNÇÃO
    @BeforeEach
    public void iniciar(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void finaliza() {
        driver.close();
    }

    @Test
    public void buscaCurso() {

        driver.get(url);
        driver.findElement(By.id("searchtext")).sendKeys("Mantis" + Keys.ENTER);
        driver.findElement(By.cssSelector("span.comprar")).click();
        Assert.assertEquals("Mantis",driver.findElement(By.cssSelector("span.item-title")).getText());
        Assert.assertEquals("R$ 49,99", driver.findElement(By.cssSelector("span.new-price")).getText());

    }




}
