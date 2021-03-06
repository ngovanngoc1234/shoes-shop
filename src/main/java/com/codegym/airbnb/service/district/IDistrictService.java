package com.codegym.airbnb.service.district;

import com.codegym.airbnb.model.District;
import com.codegym.airbnb.model.Province;
import com.codegym.airbnb.service.IGeneralService;

public interface IDistrictService extends IGeneralService<District> {
    Iterable<District> findAllByProvince(Province province);
}
