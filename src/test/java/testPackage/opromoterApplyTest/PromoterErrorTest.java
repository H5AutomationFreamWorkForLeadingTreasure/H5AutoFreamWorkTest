package testPackage.opromoterApplyTest;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import basicTool.StringUtilsTool;
import dataBean.pc.opromoter.OpromoterBean;
import dataTool.DataFactory;
import page.pc.NavigationPage;
import page.pc.promoterApply.OpromoterApplyPage;
import testCases.AbstractTestCases;

public class PromoterErrorTest extends AbstractTestCases {
    NavigationPage navigationPage;
    OpromoterBean opromoterBean;
    OpromoterApplyPage opromoterApplyPage;

    @Test(testName = "opromoterApply4", description = "校验姓名", groups = "pc")
    public void testPersonName() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterBean.setPromoterName("测试测试测试测试测试测试测试");
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, false);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply5", description = "校验身份证号", groups = "pc")
    public void testIdCardNo() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterBean.setIdCardNo("123456789012345678990");
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, false);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply6", description = "校验联系电话长度", groups = "pc")
    public void testTelePhoneNoLength() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterBean.setTelePhoneNo("191000000121");
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, false);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply7", description = "校验联系电话输入非数字", groups = "pc")
    public void testTelePhoneNo() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterBean.setTelePhoneNo("191000000qq");
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, false);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply8", description = "校验邮箱", groups = "pc")
    public void testEmail() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterBean.setEmail("qwww@13ff");
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, false);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply9", description = "校验所在省", groups = "pc")
    public void testProvince() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterBean.setProvince("");
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, false);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply10", description = "校验所在市", groups = "pc")
    public void testCity() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        opromoterBean.setCity("城市城市城市城市城市城市城市城市");
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, false);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

    @Test(testName = "opromoterApply11", description = "校验合作资源", groups = "pc")
    public void testCooperSource() throws Exception {
        navigationPage = new NavigationPage(driver);
        opromoterApplyPage = navigationPage.clickPromoterApplyLink();
        opromoterBean = DataFactory.GetData(OpromoterBean.class);
        StringUtilsTool stringUtilsTool = new StringUtilsTool();
        String str = stringUtilsTool.appendToStringBuffer(601, "源");
        opromoterBean.setCooperSource(str);
        opromoterApplyPage.fillOpromoterInformation(opromoterBean, false);
        WebReporter.log(driver, driver.getTitle(), true, true);
    }
}
