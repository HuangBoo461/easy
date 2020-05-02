package net.oiyou.temp.svn.service;

/**
 * @author HuangBoo
 */
public interface ISvnService {

    /**
     * 创建SNV版本库服务
     * @author Allen
     * @date 2016年8月11日
     */
    void createSvnRepository();

    /**
     * 关闭版本库容器,便于刷新重连等
     * @author Allen
     * @date 2016年8月11日
     */
    void closeRepo();

    /**
     * 创建svn客户操作服务
     * @author Allen
     * @date 2016年8月11日
     */
    void createSvnClientManager();

}
