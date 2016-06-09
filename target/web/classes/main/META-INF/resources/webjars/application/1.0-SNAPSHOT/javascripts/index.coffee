$ ->
  $.get "/countrys", (countrys) ->
    $.each countrys, (index, country) ->
      $("#countrys").append $("<li>").text country.name