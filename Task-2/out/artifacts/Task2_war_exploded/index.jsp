<%--
  Created by IntelliJ IDEA.
  User: ysingh
  Date: 21-06-2020
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome to Bronx Zoo</title>
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <script src="resources/js/jquery-min.js"></script>
    <script src="resources/js/bootstrap.js"></script>
  </head>
  <body style="background-color: #d2ebee">
  <nav class="navbar navbar-dark bg-primary">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="#">Bronx Zoo, New York</a>
      </div>
      <ul class="nav navbar-nav">
        <li class="active" ><a href="/register">Register</a></li>
        <li><a href="/login">Log In</a></li>
      </ul>
    </div>
  </nav>
  <marquee style="color:red;" direction='right'>Tickets now on Sale for 4th of July!</marquee>
  <div >

    <div class="container">
      <h2>Animal Gallery</h2>
      <p>New additions to the Bronx zoo</p>
      <div class="row">
        <div class="col-md-4">
          <div class="thumbnail">
            <a href="resources/images/index (1).jpg" target="_blank">
              <img src="resources/images/index (1).jpg" alt="Cheetah" style="width:100%">
              <div class="caption">
                <p>Cheetah, the fastest land mammal. We have 4 male and 2 female cheetahs.</p>
              </div>
            </a>
          </div>
        </div>
        <div class="col-md-4">
          <div class="thumbnail">
            <a href="resources/images/index (2).jpg" target="_blank">
              <img src="resources/images/index (2).jpg" alt="elephant" style="width:100%">
              <div class="caption">
                <p>The Bronx zoo has just added 4 full-grown male and 3 female asiatic elephants</p>
              </div>
            </a>
          </div>
        </div>
        <div class="col-md-4">
          <div class="thumbnail">
            <a href="resources/images/index (4).jpg" target="_blank">
              <img src="resources/images/index (4).jpg" alt="giraffe" style="width:100%">
              <div class="caption">
                <p>The african giraffe added to enclosure 4!</p>
              </div>
            </a>
          </div>
        </div>
        <div class="col-md-4">
          <div class="thumbnail">
            <a href="resources/images/index (5).jpg" target="_blank">
              <img src="resources/images/index (5).jpg" alt="Pandas" style="width:100%">
              <div class="caption">
                <p>The Giant Pandas are favorite among all visitors</p>
              </div>
            </a>
          </div>
        </div>
        <div class="col-md-4">
          <div class="thumbnail">
            <a href="resources/images/index (3).jpg" target="_blank">
              <img src="resources/images/index (3).jpg" alt="Grizzly bears" style="width:100%">
              <div class="caption">
                <p>The grizzly bears are the largest predators in the North America</p>
              </div>
            </a>
          </div>
        </div>
        <div class="col-md-4">
          <div class="thumbnail">
            <a href="resources/images/index (6).jpg" target="_blank">
              <img src="resources/images/index (6).jpg" alt="Arctic Fox" style="width:100%">
              <div class="caption">
                <p>The rare arctic fox is a proud addition to the Bronx zoo family.</p>
              </div>
            </a>
          </div>
        </div>
      </div>
    </div>
    <iframe src="GI.html" class="embed-responsive-item" height="100%" width="100%">

    </iframe>
  </div>


  </body>
</html>
