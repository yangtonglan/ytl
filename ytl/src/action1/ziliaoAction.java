package action1;

import java.io.File;  

import org.apache.commons.io.FileUtils;  
import org.apache.struts2.ServletActionContext;  
  
import com.opensymphony.xwork2.ActionSupport;  

public class ziliaoAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private File UpImg;  //接受上传的文件
	@SuppressWarnings("unused")
	private String UpImgContentType; // 上传文件的名字
	private String UpImgFileName;  //上传的类型
	  
	    @Override  
	    public String execute() throws Exception {    
	        //获取项目绝对路径+upload相对路径  
	        String contextPath = ServletActionContext.getServletContext().getRealPath("/upload");  
	        System.out.println("项目的文件路径"+contextPath);
	        //项目绝对路径与上传文件组成一个新的文件
	        File destFile = new File(contextPath, UpImgFileName); 
	        System.out.println("文件保存路径"+destFile);
	        if(!destFile.getParentFile().exists()) {
	        	destFile.getParentFile().mkdirs();//如果文件夹不存在，创建一个
	        }
	        FileUtils.copyFile(UpImg, destFile);  //保存文件
	        return "suc";  
	    }  
	    
	    
	    
	    
	    public void setUpImg(File upImg) {  
	        UpImg = upImg;  
	    }  
	    public void setUpImgContentType(String upImgContentType) {  
	        UpImgContentType = upImgContentType;  
	    }  
	    public void setUpImgFileName(String upImgFileName) {  
	        UpImgFileName = upImgFileName;  
	    }  
}
