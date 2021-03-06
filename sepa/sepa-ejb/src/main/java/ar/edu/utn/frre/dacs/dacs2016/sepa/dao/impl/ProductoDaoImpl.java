/*
 * Copyright (C) 2016 UTN-FRRe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.utn.frre.dacs.dacs2016.sepa.dao.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;

import ar.edu.utn.frre.dacs.dacs2016.sepa.dao.ProductoDao;
import ar.edu.utn.frre.dacs.dacs2016.sepa.model.Producto;

/**
 * @author Dr. Jorge Eduardo Villaverde
 *
 */
@Stateless
@Local(ProductoDao.class)
public class ProductoDaoImpl extends GenericDaoImpl<Producto> implements
		ProductoDao {

	/* (non-Javadoc)
	 * @see ar.edu.utn.frre.dacs.dacs2016.sepa.dao.impl.GenericDaoImpl#getEntityClazz()
	 */
	@Override
	protected Class<Producto> getEntityClazz() {
		return Producto.class;
	}

}
