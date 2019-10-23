package com.gameley.demo;

/**
 * Created by B038 on 2018/1/30 0030.
 */
//@WebAppConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = DemoApplication.class)
public class Swagger2MarkupTestOld {

//    @Autowired
//    private WebApplicationContext context;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
//    }
//
//    @Test
//    public void createSpringfoxSwaggerJson() throws Exception {
//        String outputDir = "src/docs/json";  //将api-docs的json数据写入文件
//        MvcResult mvcResult = this.mockMvc.perform(get("/v2/api-docs")
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andReturn();
//
//        MockHttpServletResponse response = mvcResult.getResponse();
//        String swaggerJson = response.getContentAsString();
//        Files.createDirectories(Paths.get(outputDir));
//        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputDir, "swagger2.json"), StandardCharsets.UTF_8)) {
//            writer.write(swaggerJson);
//        }
//    }
}
