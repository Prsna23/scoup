package com.themillhousegroup.scoup.test

trait HtmlFixtures {

  val nestedList =
    """
      <div id="wrapper">
      <h3 id="firstHeading">First Heading</h3>
      <ul id="firstList">
        <li id="l1i1">One</li>
        <li id="l1i2">Two</li>
        <li id="l1i3">Three</li>
      </ul>
      <h3 id="secondHeading">Second Heading</h3>
      <ul id="secondList">
        <li id="l2i1">One</li>
        <li id="l2i2" uniqueAttribute="true">Two</li>
        <li id="l2i3">Three</li>
      </ul>
      <h3 id="thirdHeading">Third Heading</h3>
      <ul id="thirdList">
          <li id="l3i1">One</li>
          <li id="l3i2">Two</li>
          <li id="l3i3">Three</li>
        </ul>
      </div>
    """.stripMargin

  val variousAttributes =
    """
        <h1 id="top" class="foo"/>
        <h2 id="middle" class=""/>
        <h2 id="bottom"/>
      """.stripMargin

  val fullHtml =
    """
			<html>
      	<head>
					<script type="text/javascript">var desc="Style attribute should appear in dataNode queries";</script>
				</head>
				<body>
					<h1>Header</h1>
					<p>Some Text</p>
				</body>
			</html>	
		"""
}
