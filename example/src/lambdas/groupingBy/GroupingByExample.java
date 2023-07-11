package lambdas.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        BlogPost davidePost = new BlogPost("Aula Info 2 - Review", "Davide", BlogPostType.REVIEW, 1);
        BlogPost davidePost1 = new BlogPost("Aula Info 1 - Review", "Davide", BlogPostType.REVIEW, 15);
        BlogPost davidePost2 = new BlogPost("Aula Info 0 - Review", "Davide", BlogPostType.REVIEW, 12);
        BlogPost matteoPost = new BlogPost("Tagliatelle", "Matteo", BlogPostType.NEWS, 10);
        BlogPost matteoPost1 = new BlogPost("Linguine", "Matteo", BlogPostType.NEWS, 101);
        BlogPost stefaniaPost = new BlogPost("Laptop & co.", "Stefania", BlogPostType.GUIDE, 100);
        BlogPost stefaniaPost1 = new BlogPost("Smartphone & co.", "Stefania", BlogPostType.GUIDE, 1002);

        List<BlogPost> blogPostList = List.of(davidePost, davidePost1, davidePost2, matteoPost, matteoPost1, stefaniaPost, stefaniaPost1);

        Map<BlogPostType, List<BlogPost>> groupedByType = blogPostList.stream()
                .collect(Collectors.groupingBy(BlogPost::getType));


    }


}
