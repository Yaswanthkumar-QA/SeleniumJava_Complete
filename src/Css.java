import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.getCurrentUrl();
		/*driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("yaswanthkumar94@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("yaswanth1234");
		driver.findElement(By.name("login")).submit();*/
		//driver.findElement(By.className("hu5pjgll op6gxeva sp_FzlZ3uyhJfm sx_3bf2e6")).click();
		//driver.findElement(By.className("d2edcug0 hpfvmrgz qv66sw1b c1et5uql rrkovp55 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m")).click();
		//driver.findElement(By.cssSelector("#email")).sendKeys("Hi");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("hello");
		
		
		// Customized Xpath (Syntax: //tagName[@attributeName='Value'])
		
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hi");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//button[@value='1']")).submit();
		System.out.println(driver.findElement(By.xpath("//div[@class='_9ay7']")).getText());*/
		
		
		// Customized CSS (Syntax: tagName[attributeName='Value'])
		
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Hi");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("Hi");
		driver.findElement(By.cssSelector("#email")).sendKeys("Hi");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("hello");
		//driver.findElement(By.cssSelector("div[class*='u_0_c_Rq']")).click(); //-- Through an error
		driver.findElement(By.cssSelector("button[value='1']")).submit();
		System.out.println(driver.findElement(By.cssSelector("div[class='_9ay7']")).getText());
		
		
		
		//driver.findElement(By.cssSelector("#mount_0_0_T7 > div > div:nth-child(1) > div > div:nth-child(4) > div.ehxjyohh.kr520xx4.poy2od1o.b3onmgus.hv4rvrfc.n7fi1qx3 > div.du4w35lb.l9j0dhe7.byvelhso.rl25f0pe.j83agx80.bp9cbjyn > span > div > div.oajrlxb2.oo1teu6h.qu0x051f.esr5mh6w.e9989ue4.r7d6kgcz.rq0escxv.nhd2j8a9.j83agx80.p7hjln8o.kvgmc6g5.cxmmr5t8.oygrvhab.hcukyx3x.jb3vyjys.rz4wbd8a.qt6c0cv9.a8nywdso.i1ao9s8h.esuyzwwr.f1sip0of.lzcic4wl.l9j0dhe7.abiwlrkh.p8dawk7l.bp9cbjyn.s45kfl79.emlxlaya.bkmhp75w.spb7xbtv.rt8b4zig.n8ej3o3l.agehan2d.sk4xxmp2.taijpn5t.qypqp5cg.q676j6op > i")).click();
		//driver.findElement(By.cssSelector("#mount_0_0_T7 > div > div:nth-child(1) > div > div:nth-child(4) > div.ehxjyohh.kr520xx4.poy2od1o.b3onmgus.hv4rvrfc.n7fi1qx3 > div:nth-child(2) > div > div > div.j34wkznp.qp9yad78.pmk7jnqg.kr520xx4 > div.iqfcb0g7.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p > div > div > div > div > div > div > div > div > div.rq0escxv.pmk7jnqg.du4w35lb.pedkr2u6.oqq733wu.ms05siws.pnx7fd3z.b7h9ocf4.j9ispegn.kr520xx4.k4urcfbm > div > div.a8nywdso.sj5x9vvc.rz4wbd8a.ecm0bbzt > div > div:nth-child(4) > div > div.ow4ym5g4.auili1gw.rq0escxv.j83agx80.buofh1pr.g5gj957u.i1fnvgqd.oygrvhab.cxmmr5t8.hcukyx3x.kvgmc6g5.nnctdnn4.hpfvmrgz.qt6c0cv9.jb3vyjys.l9j0dhe7.du4w35lb.bp9cbjyn.btwxx1t3.dflh9lhu.scb9dxdr > div.ow4ym5g4.auili1gw.rq0escxv.j83agx80.buofh1pr.g5gj957u.i1fnvgqd.oygrvhab.cxmmr5t8.hcukyx3x.kvgmc6g5.tgvbjcpo.hpfvmrgz.qt6c0cv9.rz4wbd8a.a8nywdso.jb3vyjys.du4w35lb.bp9cbjyn.btwxx1t3.l9j0dhe7 > div > div > div > div > span")).click();
		
		//driver.findElement(By.xpath("//*[@id='u_0_c_/W']")).click();
		//driver.findElement(By.cssSelector("#pass")).sendKeys("hello");
		
	}

}