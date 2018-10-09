package org.afive.wecheck.remote.controller;


import org.afive.wecheck.remote.bean.RemoteConfigBean;
import org.afive.wecheck.remote.mapper.RemoteConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "remote")
public class RemoteConfigController {

	@Autowired
	private RemoteConfigMapper remoteConfigMapper;
	
	@RequestMapping(value = "/{parameterKey}", method = RequestMethod.GET)
	private RemoteConfigBean get(@PathVariable(value = "parameterKey") String parameterKey){
		return remoteConfigMapper.get(parameterKey); 
	}
}
