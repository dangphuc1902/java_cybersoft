package com.dtp.WebNetFlix.controllertest.dto;

import com.dtp.WebNetFlix.service.PostService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/post")
public class PostController {
//
//        @RequestMapping(method = RequestMethod.GET)
        PostService postService = new PostService();
        @GetMapping
        public PostDto getPost(@RequestParam int id) {
            // Truy xuất dữ liệu trả về kq
            PostDto result = postService.getPost(id);
            return result;
        }

//            @RequestMapping(method = RequestMethod.POST)
        // Các bài đăng dài có thể gửi qua @RequestBody thông qua JSON.
        // Sau đó test bằng postman và kiểm tra ở terminal.
        // TODO @RequestBody
        @PostMapping

        public String savePost(@RequestBody PostDto postDto) {
            // Xử lý dữ liệu
            System.out.println(postDto.getId());
            System.out.println(postDto.getTitle());
            System.out.println(postDto.getContent());
            System.out.println(postDto.getUsername());
            return "POST /post";
        }

//            @RequestMapping(method = RequestMethod.PUT)
        @PutMapping
        public String updatePost() {
            // Xử lý cập nhật.
            return "PUT /post";
        }

//            @RequestMapping(method = RequestMethod.DELETE)
        @DeleteMapping
        public String deletePost() {
            // Xử lý xóa.
            return "DELETE /post";
        }


}
