package com.taotao.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * User: huangken
 * Date: 25/6/17
 * Time: PM12:06
 */
public interface PictureService {

    Map uploadPicture(MultipartFile uploadFile);

}
