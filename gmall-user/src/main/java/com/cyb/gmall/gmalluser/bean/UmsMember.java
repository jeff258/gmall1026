package com.cyb.gmall.gmalluser.bean;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.util.Date;

/**
 * @Description  
 * @Author  CYB
 * @Date 2019-10-27 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="ums_member" )
public class UmsMember  implements Serializable {

	private static final long serialVersionUID =  656628448371189261L;
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "member_level_id" )
	private Long memberLevelId;

	/**
	 * 用户名
	 */
   	@Column(name = "username" )
	private String username;

	/**
	 * 密码
	 */
   	@Column(name = "password" )
	private String password;

	/**
	 * 昵称
	 */
   	@Column(name = "nickname" )
	private String nickname;

	/**
	 * 手机号码
	 */
   	@Column(name = "phone" )
	private String phone;

	/**
	 * 帐号启用状态:0->禁用；1->启用
	 */
   	@Column(name = "status" )
	private Long status;

	/**
	 * 注册时间
	 */
   	@Column(name = "create_time" )
	private Date createTime;

	/**
	 * 头像
	 */
   	@Column(name = "icon" )
	private String icon;

	/**
	 * 性别：0->未知；1->男；2->女
	 */
   	@Column(name = "gender" )
	private Long gender;

	/**
	 * 生日
	 */
   	@Column(name = "birthday" )
	private Date birthday;

	/**
	 * 所做城市
	 */
   	@Column(name = "city" )
	private String city;

	/**
	 * 职业
	 */
   	@Column(name = "job" )
	private String job;

	/**
	 * 个性签名
	 */
   	@Column(name = "personalized_signature" )
	private String personalizedSignature;

	/**
	 * 用户来源
	 */
   	@Column(name = "source_type" )
	private Long sourceType;

	/**
	 * 积分
	 */
   	@Column(name = "integration" )
	private Long integration;

	/**
	 * 成长值
	 */
   	@Column(name = "growth" )
	private Long growth;

	/**
	 * 剩余抽奖次数
	 */
   	@Column(name = "luckey_count" )
	private Long luckeyCount;

	/**
	 * 历史积分数量
	 */
   	@Column(name = "history_integration" )
	private Long historyIntegration;

}
