package com.huang.myfirstmap.demo.util;

/**
 * Created by huang on 2016/5/30.
 */
public class HomeGrid {
    int gridBitmap;
    String gridCategory;

    @Override
    public String toString() {
        return "HomeGrid{" +
                "gridBitmap=" + gridBitmap +
                ", gridCategory='" + gridCategory + '\'' +
                '}';
    }

    public HomeGrid(int gridBitmap, String gridCategory) {
        this.gridBitmap = gridBitmap;
        this.gridCategory = gridCategory;
    }

    public HomeGrid() {
    }

    public int getGridBitmap() {
        return gridBitmap;
    }

    public void setGridBitmap(int gridBitmap) {
        this.gridBitmap = gridBitmap;
    }

    public String getGridCategory() {
        return gridCategory;
    }

    public void setGridCategory(String gridCategory) {
        this.gridCategory = gridCategory;
    }
}
