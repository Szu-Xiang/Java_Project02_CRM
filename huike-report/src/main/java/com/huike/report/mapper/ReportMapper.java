package com.huike.report.mapper;

import java.util.List;
import java.util.Map;

import com.huike.report.domain.vo.PieChartVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.huike.clues.domain.vo.IndexStatisticsVo;
import org.springframework.security.core.parameters.P;

/**
 * 首页统计分析的Mapper
 * @author Administrator
 *
 */
@Mapper
public interface ReportMapper {
	/**=========================================基本数据========================================*/
	/**
	 * 获取线索数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getCluesNum(@Param("startTime") String beginCreateTime,
						@Param("endTime") String endCreateTime,
						@Param("username") String username);

	/**
	 * 获取商机数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getBusinessNum(@Param("startTime") String beginCreateTime,
						   @Param("endTime") String endCreateTime,
						   @Param("username") String username);

	/**
	 * 获取合同数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getContractNum(@Param("startTime") String beginCreateTime,
						   @Param("endTime") String endCreateTime,
						   @Param("username") String username);

	/**
	 * 获取合同金额
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Double getSalesAmount(@Param("startTime") String beginCreateTime,
						  @Param("endTime") String endCreateTime,
						  @Param("username") String username);

	/**=========================================今日简报========================================*/

	/**
	 * 今日新增线索
	 * @param today       今日日期
	 * @param username	  登录的用户
	 * @return
	 */
	Integer getTodayClue(@Param("now") String today, @Param("username") String username);


	/**
	 * 今日新增商机
	 * @param today	      今日日期
	 * @param username	  登录的用户
	 * @return
	 */
	Integer getTodayBusiness(@Param("now") String today, @Param("username") String username);

	/**
	 * 今日新增合同
	 * @param today		   今日日期
	 * @param username	   登录的用户
	 * @return
	 */
	Integer getTodayContract(@Param("now") String today, @Param("username") String username);


	/**
	 * 今日销售额
	 * @param today		   今日日期
	 * @param username	   登录的用户
	 * @return
	 */
	Double getTodaySalesAmount(@Param("now") String today, @Param("username") String username);



	/**=========================================待办========================================*/

	Integer getToFollowedCluesNum(@Param("beginTime") String beginCreateTime,
								  @Param("endTime") String endCreateTime,
								  @Param("username") String username);


	/**
	 * 首页--今日待办--待跟进商机数量
	 * @param beginCreateTime  开始时间
	 * @param endCreateTime	   结束时间
	 * @param username		   用户名
	 * @return
	 */
	Integer getToFollowedBusinessNum(@Param("startTime")String beginCreateTime,
								  @Param("endTime")String endCreateTime,
								  @Param("username")String username);


	/**
	 * 首页--今日待办--待分配线索数量
	 * @param beginCreateTime  开始时间
	 * @param endCreateTime	   结束时间
	 * @param username		   用户名
	 * @return
			 */
	Integer getToAllocatedCluesNum(@Param("startTime")String beginCreateTime,
								   @Param("endTime")String endCreateTime,
								   @Param("username")String username);

	/**
	 * 首页--今日待办--待分配商机数量
	 * @param beginCreateTime  开始时间
	 * @param endCreateTime	   结束时间
	 * @param username		   用户名
	 * @return
	 */
	Integer getToAllocatedBusinessNum(@Param("startTime")String beginCreateTime,
									  @Param("endTime")String endCreateTime,
									  @Param("username")String username);

	/**
	 * 统计分析--饼状图实现
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @return
	 */
	public List<PieChartVO> subjectStatistics(@Param("beginCreateTime") String beginCreateTime,
											  @Param("endCreateTime") String endCreateTime);

}
