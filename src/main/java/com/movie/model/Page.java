package com.movie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page {

    int pageSize;

    int pageCount;

    int pageNumber;

    int sizeList;

    int itemStart;
}
