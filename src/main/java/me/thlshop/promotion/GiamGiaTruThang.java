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
public class GiamGiaTruThang extends GiamGiaService {

	private List<Integer> spGiamGia = Arrays.asList(2, 4);
	private int giaGiam = 5000;

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
			sanPham.setPrice(sanPham.getPrice() - giaGiam);
			sanPham.setProductName(sanPham.getProductName() +  " (Giam gia tru thang!)");
		}
	}

}
