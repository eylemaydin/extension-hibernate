package org.lucee.extension.orm.hibernate.tuplizer;

import java.io.IOException;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class CFCEntityResolver implements EntityResolver {

	@Override
	public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
		return null;
	}

}
