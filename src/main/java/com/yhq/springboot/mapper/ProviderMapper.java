package com.yhq.springboot.mapper;

import com.yhq.springboot.entities.Provider;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @Auther:
 */
@Mapper
public interface ProviderMapper {

    List<Provider> getProviders(Provider provider);

    Provider getProviderByPid(Integer pid);

    int addProvider(Provider provider);

    int deleteProviderByPid(Integer pid);

    int updateProvider(Provider provider);

}
