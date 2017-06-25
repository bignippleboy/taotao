package com.taotao.ftp;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * User: huangken
 * Date: 25/6/17
 * Time: AM11:44
 */
public class FtpTest {
    public static void main(String[] args) throws IOException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("192.168.199.233");
        ftpClient.login("ftpuser", "123456");
        FileInputStream inputStream = new FileInputStream(new File("/Users/huangken/Downloads/cube2/_b.jpg"));
        ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        ftpClient.storeFile("123.jpg", inputStream);
        inputStream.close();
        ftpClient.logout();
    }
}
