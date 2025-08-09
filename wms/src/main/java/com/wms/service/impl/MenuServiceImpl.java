package com.wms.service.impl;

import com.wms.dao.MenuDao;
import com.wms.entity.Menu;
import com.wms.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单表(Menu)表服务实现类
 *
 * @author makejava
 * @since 2025-08-09 23:39:35
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Menu queryById(Integer id) {
        return this.menuDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param menu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
/*    @Override
    public Page<Menu> queryByPage(Menu menu, PageRequest pageRequest) {
        long total = this.menuDao.count(menu);
        return new PageImpl<>(this.menuDao.queryAllByLimit(menu, pageRequest), pageRequest, total);
    }*/

    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu insert(Menu menu) {
        this.menuDao.insert(menu);
        return menu;
    }

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu update(Menu menu) {
        this.menuDao.update(menu);
        return this.queryById(menu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.menuDao.deleteById(id) > 0;
    }

    //    List<Menu> queryAllByLimit(Menu menu, @Param("pageable") Pageable pageable);
    @Override
    public List<Menu> queryMenuList(Integer roleId) {
        return menuDao.queryMenuList(roleId);
    }
}
