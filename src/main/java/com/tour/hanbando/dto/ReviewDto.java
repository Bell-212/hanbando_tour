package com.tour.hanbando.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewDto {
  private int reviewNo;
  private int packageNo;
  private String reviewContents;
  private int hotelNo;
  private int star;
  private String registAt;
  private UserDto userDto;
}
