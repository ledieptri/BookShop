package me.thlshop.service;

import me.thlshop.dto.InformationDTO;
import me.thlshop.dto.ProductDetailDTO;

public interface IInformationService {
	InformationDTO findOne(Integer infId);
	void update(InformationDTO informationDTO);
	Integer save(InformationDTO informationDTO);
}
