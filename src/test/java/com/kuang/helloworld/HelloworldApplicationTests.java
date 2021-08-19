package com.kuang.helloworld;


import com.alibaba.druid.pool.DruidDataSource;
import com.kuang.mapper.DepartmentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class HelloworldApplicationTests {
@Autowired
	DataSource dataSource;
	@Autowired
	DepartmentMapper departmentMapper;
	@Test
	public void contextLoads() throws SQLException {
		System.out.println(departmentMapper.getDepartments());


	}
	@Test
	public void druidTest() throws SQLException {
		//看一下默认数据源
		System.out.println(dataSource.getClass());
		//获得连接
		Connection connection = dataSource.getConnection();
		System.out.println(connection);

		DruidDataSource druidDataSource = (DruidDataSource) dataSource;
		System.out.println("druidDataSource 数据源最大连接数：" + druidDataSource.getMaxActive());
		System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSource.getInitialSize());

		//关闭连接
		connection.close();
	}

}
