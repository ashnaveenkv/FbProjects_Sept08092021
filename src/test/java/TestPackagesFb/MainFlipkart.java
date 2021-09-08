package TestPackagesFb;

import java.util.List;

import org.flipkartbase.ProjectBasePackagesflipkart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class MainFlipkart extends ProjectBasePackagesflipkart {
	
public static void main(String[] args) {
	
	MainFlipkart fk = new MainFlipkart();
	
	fk.fkart();
	
}
		
	

		private void fkart() {
			launchBrowser("chrome");
			launchurl("https://www.flipkart.com/");
			implicitwait(5);
			
			flipkartelements fk = new flipkartelements();
			click(fk.getCloselogin());
			filltextbox(fk.getFksearch() , "Iphone");
			Enter(fk.getFksearch());	
			
		
			
			List<WebElement> iphones =driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
			
			List<WebElement> cost = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			

			
	
			System.out.println("Normal Loops");
			/*Phone Model*/
			int i;
			for( i =0;i<iphones.size();i++)
			{
				WebElement text = iphones.get(i);
				if(i <=20)
				System.out.println(text.getText());
				
			}
			
			/*Phone Cost*/
			int j;
			for( j =0;j<cost.size();j++)
			{
				WebElement text = cost.get(j);
				
				System.out.println(text.getText());
				
			}
			
			

}

}