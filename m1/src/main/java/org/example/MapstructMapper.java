package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;

/**
 * @author whq46936
 * @version Id: MapstructMapper, v 0.1 2020/7/30 13:48 whq46936 Exp $
 */
@Mapper(componentModel = "default",  nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface MapstructMapper {

    /**
     * 
     * @param t1
     * @return
     */
    T2 v2d(T1 t1);
}