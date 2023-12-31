package com.tour.hanbando.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.tour.hanbando.dto.ReserveDto;

public interface HotelService {
  /********************리스트**************************/
  public Map<String, Object> getHotelList(HttpServletRequest request);
  public int increseHit(int hotelNo);
  public void regionList(Model model);
  public Map<String, Object> hotelRoomList(HttpServletRequest request);
  public void makeHotelNo(Model model);
  public boolean writeRoom(MultipartHttpServletRequest multipartRequest, List<MultipartFile> files) throws Exception;
  public boolean writeHotel(MultipartHttpServletRequest multipartRequest) throws Exception;
  public void hoteDetail(HttpServletRequest request, int hotelNo, Model model);
  public Map<String, Object> loadReviewList(HttpServletRequest request);
  public Map<String, Object> addReview(HttpServletRequest request);
  public double getAverageRating(int hotelNo);
  public Map<String, Object> getAttachList(HttpServletRequest request);
  public Map<String, Object> getFinalPrice(HttpServletRequest request);
  public List<ReserveDto> getReserveUser(int hotelNo); 
  public Map<String, Object> removeReview(int reviewNo);
  public Map<String, Integer> getHeartState(HttpServletRequest request);
  public void getHeartHotel(HttpServletRequest request, Model model);
  public Map<String, Object> removeHotelHeart(int hotelNo);
  public int removehotel(int hotelNo);
  public Map<String, Object> removeImage(HttpServletRequest request);
  public boolean modifyHotel(MultipartHttpServletRequest multipartRequest) throws Exception;
  public boolean modifyRoom(MultipartHttpServletRequest multipartRequest, List<MultipartFile> files) throws Exception;
  public void getRoom(int roomNo, Model model);
  public void gethotel(HttpServletRequest request, Model model);
  public int deleteRoom(HttpServletRequest request);
}
