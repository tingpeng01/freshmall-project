package cn.tedu.product.controller;

import cn.tedu.product.service.ProductService;
import com.fresh.common.pojo.Product;
import com.fresh.common.vo.EasyUIResult;
import com.fresh.common.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class ProductControler {

    @Autowired
    private ProductService productService = null;

    /**
     * 根据商品id查询商品详情
     * @param productId 商品id
     * @return  商品详情
     */
    @RequestMapping("/detail/{productId}")
    public Product queryProductDetail(String productId){
        return productService.queryProductDetail(productId);
    }


    /**
     * 根据商品大类的分页查询
     * @param page 第几页
     * @param rows 每页商品条数
     * @param pdlcode 商品大类参数
     * @return 商品集合的json
     */
    @RequestMapping("/query/{pdlcode}")
    public EasyUIResult queryProductByPdlcodeAndPage(Integer page,Integer rows,@PathVariable String pdlcode){
        return  productService.queryProductByPdlcodeAndPage(page,rows,pdlcode);
    }

    /**
     * 根据商品小类的分页查询
     * @param page
     * @param rows
     * @param pxlcode
     * @return
     */
    @RequestMapping("/query/{pxlcode}")
    public EasyUIResult queryProductByPxlcodeAndPage(Integer page,Integer rows,@PathVariable String pxlcode){
        return  productService.queryProductByPxlcodeAndPage(page,rows,pxlcode);
    }

    /**
     * 根据商品名称的分页查询
     * @param page
     * @param rows
     * @param pname
     * @return
     */
    @RequestMapping("/query/{pname}")
    public EasyUIResult queryProductByPnameAndPage(Integer page,Integer rows,@PathVariable String pname){
        return  productService.queryProductByPnameAndPage(page,rows,pname);
    }

    /**
     * 新增商品
     * @param product
     * @return
     */
    @RequestMapping("/save")
    public SysResult addProduct(Product product){
        try {
            productService.addProduct(product);
            return SysResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return SysResult.build(201,"新增商品失败",null);
        }
    }

    /**
     * 更新-删除商品
     * @return
     */
    @RequestMapping("update")
    public SysResult updateProduct(String pid){
        try {
            productService.updateProduct(pid);
            return SysResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return SysResult.build(201,"更新或删除商品失败",null);
        }
    }
}
