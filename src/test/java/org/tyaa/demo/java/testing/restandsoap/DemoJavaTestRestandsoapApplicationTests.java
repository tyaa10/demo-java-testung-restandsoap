package org.tyaa.demo.java.testing.restandsoap;

import org.junit.jupiter.api.Test;
import org.tyaa.demo.java.testing.restandsoap.entities.*;

import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DemoJavaTestRestandsoapApplicationTests {

	@Test
	void givenLibraryProxy_whenGetBooksByAuthor_thenAuthorListFetched() {
		// Create Client Fabric
		LibraryPortService libraryPortService = new LibraryPortService();
		// Create one Client using Fabric
		LibraryPort libraryPort = libraryPortService.getLibraryPortSoap11();
		// 1. Get All The Authors
		GetAuthorsRequest request = new GetAuthorsRequest();
		SearchParamsWithPagination params = new SearchParamsWithPagination();
		params.setOrderType("asc");
		params.setSize(10);
		request.setSearch(params);
		GetAuthorsResponse authors = libraryPort.getAuthors(request);
		assertNotNull(authors);
		List<AuthorType> authorList = authors.getAuthors().getAuthor();
		assertNotNull(authorList);
		authorList.forEach(
			a -> System.out.printf("%s %s\n", a.getAuthorName().getFirst(), a.getAuthorName().getSecond())
		);
		// 2. Check Author List (should be not null)
		assertNotEquals(0, authorList.size());
	}
}
