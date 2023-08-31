package me.thlshop.service.impl;

import javax.inject.Inject;

import me.thlshop.converter.InformationConverter;
import me.thlshop.dao.IInformationDAO;
import me.thlshop.dto.InformationDTO;
import me.thlshop.dto.ProductDetailDTO;
import me.thlshop.entity.InformationEntity;
import me.thlshop.service.IInformationService;

public class InformationService implements IInformationService{

	@Inject
	private IInformationDAO informationDAO;
	
	@Inject
	private InformationConverter informationConverter;
	
	@Override
	public InformationDTO findOne(Integer infId) {
		InformationEntity inEntity = informationDAO.findOne(infId);
		return informationConverter.toDto(inEntity);
	}

	@Override
	public void update(InformationDTO informationDTO) {
		InformationEntity inEntity = new InformationEntity();
		inEntity.setInfoId(informationDTO.getInfoId());
		inEntity.setScreen(informationDTO.getScreen());
		inEntity.setCameraSelfie(informationDTO.getCameraSelfie());
		inEntity.setRam(informationDTO.getRam());
		inEntity.setCamera(informationDTO.getCamera());
		inEntity.setCpu(informationDTO.getCpu());
		inEntity.setMemory(informationDTO.getMemory());
		inEntity.setGpu(informationDTO.getGpu());
		inEntity.setCell(informationDTO.getCell());
		inEntity.setSim(informationDTO.getSim());
		inEntity.setOs(informationDTO.getOs());
		informationDAO.update(inEntity);
	}

	@Override
	public Integer save(InformationDTO informationDTO) {
		InformationEntity inEntity = new InformationEntity();
		inEntity.setInfoId(informationDTO.getInfoId());
		inEntity.setScreen(informationDTO.getScreen());
		inEntity.setCameraSelfie(informationDTO.getCameraSelfie());
		inEntity.setRam(informationDTO.getRam());
		inEntity.setCamera(informationDTO.getCamera());
		inEntity.setCpu(informationDTO.getCpu());
		inEntity.setMemory(informationDTO.getMemory());
		inEntity.setGpu(informationDTO.getGpu());
		inEntity.setCell(informationDTO.getCell());
		inEntity.setSim(informationDTO.getSim());
		inEntity.setOs(informationDTO.getOs());
		return informationDAO.insert(inEntity);
	}

}
