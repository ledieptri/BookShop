/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.thlshop.promotion;

import java.util.Arrays;
import java.util.List;

import me.thlshop.entity.ProductEntity;

/**
 *
 * @author ASUS
 */
public class GiamGiaPhanTram extends GiamGiaService{
    
    private List<Integer> spGiamGia = Arrays.asList(1, 3);
    private int phanTramGiaGiam = 20;
    
    public GiamGiaPhanTram(List<Integer> spGiamGia) {
    	this.spGiamGia = spGiamGia;
    }

    @Override
    protected boolean kiemTraThuocLoaiGiamGia(ProductEntity sanPham) {
                boolean giamGia = false;
        for (Integer idSpGiamGia : spGiamGia) {
            if (idSpGiamGia.equals(sanPham.getProductId())) {
                giamGia = true;
                break;
            }
        }
        return giamGia;
    }

    @Override
    protected void xuLyThongTinGiamGia(ProductEntity sanPham, boolean giamGia) {
               if (giamGia) {
            sanPham.setPrice(sanPham.getPrice()*(100 - phanTramGiaGiam)/100);
            
            sanPham.setProductName(sanPham.getProductName() + " (Giam gia phan tram!)");
        }
    }
    
}
