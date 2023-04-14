package com.example.ReactiveApiClient.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UnsplashResponse {
 private int total;
 @JsonProperty("total_pages")
        private int totalPages;
 private List<Photo> results;








    }
