package org.javaboy.vhr.service;


import org.javaboy.vhr.mapper.PositionMapper;
import org.javaboy.vhr.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;

    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }

    //增加接口
    public Integer addPosition(Position position){
        position.setEnabled(true);
        position.setCreateDate(new Date());
        return positionMapper.insertSelective(position);
    }
    //更新接口
    public Integer updatePosition(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }
    //删除接口
    public Integer deletePosition(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }
    //批量删除接口
    public Integer deletePositionByIds(Integer[] ids) {
        return positionMapper.deletePositionByIds(ids);
    }
}

