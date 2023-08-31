/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.thlshop.promotion;

import me.thlshop.entity.ProductEntity;


public abstract class GiamGiaService {
	
	//template method
	public void xuLyGiamGia(ProductEntity sanPham) {
		boolean giamGia = kiemTraThuocLoaiGiamGia(sanPham);
		xuLyThongTinGiamGia(sanPham, giamGia);
	}

	protected abstract boolean kiemTraThuocLoaiGiamGia(ProductEntity sanPham);

	protected abstract void xuLyThongTinGiamGia(ProductEntity sanPham, boolean giamGia);
}
