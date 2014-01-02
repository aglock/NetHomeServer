/**
 * Copyright (C) 2005-2013, Stefan Strömberg <stefangs@nethome.nu>
 *
 * This file is part of OpenNetHome  (http://www.nethome.nu)
 *
 * OpenNetHome is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenNetHome is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package nu.nethome.home.items.infra;

import nu.nethome.home.item.HomeItem;
import nu.nethome.home.item.HomeItemAdapter;
import nu.nethome.home.item.HomeItemType;
import nu.nethome.util.plugin.Plugin;

import java.util.logging.Logger;

/**
 * 
 * Room
 * 
 * @author Stefan
 */
@Plugin
@HomeItemType("Infrastructure")
public class Room extends HomeItemAdapter implements HomeItem {

	private static final String MODEL = ("<?xml version = \"1.0\"?> \n"
			+ "<HomeItem Class=\"Room\" Category=\"Infrastructure\" >"
			+ "  <Attribute Name=\"Items\" Type=\"Items\" Get=\"getItems\" 	Set=\"setItems\" />"
			+ "  <Attribute Name=\"Position\" Type=\"StringList\" Get=\"getPosition\" 	Set=\"setPosition\">"
			+ "    <item>Left</item> <item>Right</item>"
			+ "  </Attribute>"
			+ "</HomeItem> "); 

	private static Logger logger = Logger.getLogger(Room.class.getName());

	// Public attributes
	protected String items = "";
	protected String position = "";

	/* (non-Javadoc)
	 * @see ssg.home.HomeItem#getModel()
	 */
	public String getModel() {
		return MODEL;
	}

	/**
	 * @return Returns the items.
	 */
	public String getItems() {
		return items;
	}
	/**
	 * @param Items The items to set.
	 */
	public void setItems(String Items) {
		items = Items;
	}

	/**
	 * @return Returns the position.
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param Position The position to set.
	 */
	public void setPosition(String Position) {
		position = Position;
	}	
}
