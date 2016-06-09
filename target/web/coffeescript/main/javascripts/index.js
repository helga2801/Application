(function() {
  $(function() {
    return $.get("/countrys", function(countrys) {
      return $.each(countrys, function(index, country) {
        return $("#countrys").append($("<li>").text(country.name));
      });
    });
  });

}).call(this);

//# sourceMappingURL=index.js.map
