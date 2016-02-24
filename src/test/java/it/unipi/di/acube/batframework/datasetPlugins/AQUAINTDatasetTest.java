package it.unipi.di.acube.batframework.datasetPlugins;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import it.unipi.di.acube.batframework.problems.C2WDataset;
import it.unipi.di.acube.batframework.utils.AnnotationException;


public class AQUAINTDatasetTest extends DatasetTestBase{

	@Override
	public C2WDataset build() throws AnnotationException, XPathExpressionException, ParserConfigurationException, SAXException, IOException, URISyntaxException {
		return DatasetBuilder.getACE2004();
	}

}
