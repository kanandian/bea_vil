package com.mlxc.service.impl;

import com.mlxc.dao.CommodityRepository;
import com.mlxc.entity.Commodity;
import com.mlxc.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityRepository commodityRepository;


    @Override
    public List<Commodity> getCommodities() {
        return commodityRepository.findAll();
    }

    @Override
    public Commodity getCommodityById(long commodityId) {
        return commodityRepository.findOne(commodityId);
    }

    @Override
    @Transactional
    public void addCommodity(Commodity commodity) {
        commodityRepository.save(commodity);
    }

    public CommodityRepository getCommodityRepository() {
        return commodityRepository;
    }

    public void setCommodityRepository(CommodityRepository commodityRepository) {
        this.commodityRepository = commodityRepository;
    }
}
