package net.oiyou.easy;


import net.oiyou.common.EasyFileType;
import net.oiyou.po.EasyFileInfo;
import net.oiyou.service.EasyService;
import net.oiyou.service.impl.EasyGitServiceImpl;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class EasyTest {

    @Test
    public void gitTest(){
        String basePath = "";//""D:/test/";
        EasyService easyService = new EasyGitServiceImpl(basePath);
        List<EasyFileInfo> easyFiles = easyService.getEasyFiles();

        String explodedPath = "";
        String endPath = "";


        List<EasyFileInfo> easyFileInfos = easyService.packageChanged(easyFiles, explodedPath, endPath);

        System.out.println(easyFileInfos.size());

        for (EasyFileInfo file : easyFiles) {
            if(EasyFileType.source == file.getFileType() || EasyFileType.resources == file.getFileType()){
                System.out.println(file.getPath() + "----------" + file.getVersionType() + "-------------" + file.getFileType());
            }
        }
    }


    @Test
    public void gitTest2(){
        String basePath = "";
        EasyService easyService = new EasyGitServiceImpl(basePath);
        List<EasyFileInfo> easyFiles = easyService.getEasyFiles();

        String explodedPath = "D:\\JetBrains\\workspace\\dream\\target\\dream";
        String endPath = "";

        easyService.packageChanged(easyFiles,explodedPath,endPath);
    }

    @Test
    public void fileTest(){
        String fileSeparatorReg = File.separator.equals("/") ? File.separator : File.separator + File.separator;
        String path = "D:\\JetBrains\\workspace\\dream\\target\\dream\\WEB-INF\\classes\\com\\dream\\base\\filter\\shiro\\ShiroPermissionFactory.class";
        String fileName = path.substring(path.lastIndexOf(File.separator)+1);
        System.out.println(fileName);
    }
}
