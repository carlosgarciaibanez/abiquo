/**
 * 
 */
package com.abiquo.server.core.infrastructure.storage;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.abiquo.model.transport.WrapperDto;

/**
 * @author jdevesa@abiquo.com
 *
 */
@XmlRootElement(name = "tiers")
public class StorageDevicesDto extends WrapperDto<StorageDeviceDto>{

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = -8258548072929133424L;

	@Override
	@XmlElement(name = "tier")
	public List<StorageDeviceDto> getCollection() {
		
		return collection;
	}

}
