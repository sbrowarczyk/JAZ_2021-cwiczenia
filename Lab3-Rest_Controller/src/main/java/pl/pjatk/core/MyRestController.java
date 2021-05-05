package pl.pjatk.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homework")
public class MyRestController {


  @GetMapping("/{data}")
  public ResponseEntity<String> getDataFromPathVariable(
      @PathVariable String data) {

    return ResponseEntity.ok(data);
  }

  @GetMapping
  public ResponseEntity<String> getDataFromRequestParam(
      @RequestParam String data) {

    return ResponseEntity.ok(data);
  }

  @PutMapping("/{data}")
  public ResponseEntity<String> getDataFromPutMethod(
      @PathVariable String data) {

    return ResponseEntity.ok(data);
  }

  @PostMapping
  public ResponseEntity<String> getDataFromPostMethod(
      @RequestBody String data) {

    return ResponseEntity.ok(data);
  }

  @DeleteMapping
  public ResponseEntity getOkStatus() {

    return ResponseEntity.status(HttpStatus.OK).build();
  }

}
